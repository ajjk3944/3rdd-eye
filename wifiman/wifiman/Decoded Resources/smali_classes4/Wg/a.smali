.class public abstract LWg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LEj/b;

.field private static final b:Ljava/nio/charset/Charset;

.field private static final c:Ljava/nio/charset/Charset;

.field private static final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LWg/a;

    invoke-static {v0}, LEj/c;->i(Ljava/lang/Class;)LEj/b;

    move-result-object v0

    sput-object v0, LWg/a;->a:LEj/b;

    const-string v0, "UTF-16LE"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, LWg/a;->b:Ljava/nio/charset/Charset;

    const-string v0, "US-ASCII"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, LWg/a;->c:Ljava/nio/charset/Charset;

    const-string v0, "jcifs.maskSecretValue"

    const-string v1, "true"

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, LWg/a;->d:Z

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-boolean v0, LWg/a;->d:Z

    if-eqz v0, :cond_0

    if-eqz p0, :cond_0

    const-string v0, "^(smb.*:).*(@.*)$"

    const-string v1, "$1******$2"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
