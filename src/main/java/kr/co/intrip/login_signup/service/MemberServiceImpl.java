package kr.co.intrip.login_signup.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.intrip.login_signup.dao.MemberDAO;
import kr.co.intrip.login_signup.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;

	@Override
	public MemberDTO Login(MemberDTO memberDTO, HttpSession session) throws Exception {
		
		return memberDAO.Login(memberDTO, session);
	}

	// 아이디 찾기
	@Override
	public MemberDTO find_id(MemberDTO memberDTO, HttpSession session) throws Exception {
		return memberDAO.find_id(memberDTO, session);
	}	
	
	// 아이디 찾기
	@Override
	public MemberDTO find_id_out(MemberDTO memberDTO, HttpSession session) throws Exception {
		return memberDAO.find_id_out(memberDTO, session);
		}	
}