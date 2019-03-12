package adr.service.impl;

import java.util.List;
import java.util.Map;

import adr.dao.AddressDAO;
import adr.dao.impl.AddressDAOImpl;
import adr.data.AddressData;
import adr.service.AddressService;

public class AddressServiceImpl implements AddressService {
	private AddressDAO adao = new AddressDAOImpl();
	@Override
	public List<Map<String, String>> selectAddressList() {
		return adao.selectAddressList();
	}
	@Override
	public Map<String, String> selectAddress(Map<String,String> address) {
		return adao.selectAddress(address);
	} 
	@Override
	public boolean insertAddress(Map<String,String> address) {
		return adao.insertAddress(address);
	}
	@Override
	public boolean updateAddress(Map<String,String> address) {
		return adao.updateAddress(address);
	}
	@Override
	public boolean deleteAddress(Map<String,String> address) {
		return adao.deleteAddress(address);
	}
}
