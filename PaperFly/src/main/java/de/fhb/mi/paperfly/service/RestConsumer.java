package de.fhb.mi.paperfly.service;

import de.fhb.mi.paperfly.dto.AccountDTO;
import de.fhb.mi.paperfly.dto.RegisterAccountDTO;
import de.fhb.mi.paperfly.dto.RoomDTO;
import de.fhb.mi.paperfly.dto.TokenDTO;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @author Christoph Ott
 * @author Andy Klay (klay@fh-brandenburg.de)
 */
public interface RestConsumer {

    AccountDTO editAccount(AccountDTO account);

    AccountDTO getAccount(String mail);

    AccountDTO getAccountByUsername(String username) throws RestConsumerException;

    List<AccountDTO> getAccountsInRoom(long roomID);

    RoomDTO locateAccount(String username);

    boolean login(String mail, String password) throws RestConsumerException;

    TokenDTO register(RegisterAccountDTO account) throws UnsupportedEncodingException, RestConsumerException;

    List<AccountDTO> searchAccount(String query);
}
