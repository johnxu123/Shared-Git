package com.sharedGit.service;

import com.sharedGit.pojo.File;

import java.util.List;

public interface FileService {
    List<File> getFileListByUserid(Integer userid);

    List<File> getFileListByRepoid(Integer repoid);

    void addFile(Integer repoid, String path, Integer editor, String filetype, String message);

    void updateFile(Integer fileid, String newFilePath, Integer editor, String filetype, String message);

    void deleteFile(Integer fileid);

    List<File> getHistoryVersionList(Integer fileid);

    void goback(Integer fileid, Integer version);

    void clearRubbish();

    List<File> getRubbishList();

    void restoreVerion(Integer fileid, Integer version);
}
