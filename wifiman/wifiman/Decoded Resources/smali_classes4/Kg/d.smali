.class public abstract LKg/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKg/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/Map;)LKg/d;
    .locals 10

    new-instance v9, LLg/q;

    const-string v3, ""

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, LLg/q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIZLjava/util/Map;)V

    return-object v9
.end method


# virtual methods
.method public abstract A()Ljava/lang/String;
.end method

.method public abstract B()I
.end method

.method public abstract D()Z
.end method

.method public abstract E(LKg/d;)Z
.end method

.method public abstract F()Z
.end method

.method public abstract c()LKg/d;
.end method

.method public abstract e()Ljava/lang/String;
.end method

.method public abstract f()Ljava/lang/String;
.end method

.method public abstract i()[Ljava/net/Inet4Address;
.end method

.method public abstract k()[Ljava/net/Inet6Address;
.end method

.method public abstract l()[Ljava/net/InetAddress;
.end method

.method public abstract m()Ljava/lang/String;
.end method

.method public abstract n()Ljava/lang/String;
.end method

.method public abstract o()I
.end method

.method public abstract p()I
.end method

.method public abstract q()Ljava/util/Enumeration;
.end method

.method public abstract r(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract t()Ljava/lang/String;
.end method

.method public abstract u()Ljava/lang/String;
.end method

.method public abstract w()Ljava/lang/String;
.end method

.method public abstract x()Ljava/lang/String;
.end method

.method public abstract z()[B
.end method
