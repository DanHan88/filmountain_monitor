package com.filmountain.monitor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.filmountain.monitor.vo.HardWareInfoVO;
import com.filmountain.monitor.vo.LotusWalletVO;
import com.filmountain.monitor.vo.NodeInfoVO;
import com.filmountain.monitor.vo.SectorInfoVO;
@Mapper
public interface NanoDCMapper {

	public void addNewSector(SectorInfoVO sectorInfoVO);
	public void updateNewSector(SectorInfoVO sectorInfoVO);
	public boolean checkSectorExists(SectorInfoVO sectorInfoVO);
	public SectorInfoVO selectSectorById(SectorInfoVO sectorInfoVO);
	public void insertNewNodeInfo(NodeInfoVO nodeInfoVO);
	public void insertNewLotusWalletInfo(LotusWalletVO lotusWalletVO);
	public void insertNewHardWareInfo(HardWareInfoVO hardWareInfoVO);
	public NodeInfoVO selectLatestNodeInfo(NodeInfoVO nodeInfoVO);
	public HardWareInfoVO selectLatestHardWareInfo(HardWareInfoVO nodeInfoVO);
	public List<LotusWalletVO> selectLotusWalletVO(NodeInfoVO nodeInfoVO);
	public boolean checkOverLap(NodeInfoVO nodeInfoVO);
}
