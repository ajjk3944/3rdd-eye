.class public Lorg/snmp4j/version/VersionInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MAJOR:I = 0x2

.field public static final MINOR:I = 0x8

.field public static final PATCH:Ljava/lang/String; = ""

.field public static final UPDATE:I = 0x8

.field public static final VERSION:Ljava/lang/String; = "2.8.8"


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "2.8.8"

    return-object v0
.end method
