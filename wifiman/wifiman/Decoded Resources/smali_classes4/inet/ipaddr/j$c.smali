.class public Linet/ipaddr/j$c;
.super Lbg/d$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Linet/ipaddr/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Linet/ipaddr/j$c$a;
    }
.end annotation


# instance fields
.field public final k:Ljava/lang/String;

.field public final l:Linet/ipaddr/j$g$a;

.field public final m:C


# direct methods
.method protected constructor <init>(IZLinet/ipaddr/j$g$a;Lbg/d$i$b;Ljava/lang/String;Ljava/lang/Character;CLjava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 11

    move-object v10, p0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p8

    move/from16 v7, p10

    move/from16 v8, p11

    move/from16 v9, p12

    invoke-direct/range {v0 .. v9}, Lbg/d$i;-><init>(IZLbg/d$i$b;Ljava/lang/String;Ljava/lang/Character;Ljava/lang/String;ZZZ)V

    move-object/from16 v0, p9

    iput-object v0, v10, Linet/ipaddr/j$c;->k:Ljava/lang/String;

    move-object v0, p3

    iput-object v0, v10, Linet/ipaddr/j$c;->l:Linet/ipaddr/j$g$a;

    move/from16 v0, p7

    iput-char v0, v10, Linet/ipaddr/j$c;->m:C

    return-void
.end method
