.class public final LVc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUc/a;


# instance fields
.field private final a:LUc/b;

.field private final b:Linet/ipaddr/g;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ljava/lang/String;

.field private final f:Ljava/lang/String;

.field private final g:Lcom/ui/wifiman/model/vendor/d;

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Ljava/lang/String;

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:Ljava/util/List;

.field private final o:Ljava/util/List;

.field private final p:J

.field private final q:LVc/g;


# direct methods
.method public constructor <init>(LUc/b;Linet/ipaddr/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLVc/g;)V
    .locals 6

    move-object v0, p0

    move-object v1, p2

    move-object/from16 v2, p14

    move-object/from16 v3, p15

    move-object/from16 v4, p18

    const-string v5, "ipAddress"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "devices"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "services"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "xmlDevice"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v5, p1

    iput-object v5, v0, LVc/a;->a:LUc/b;

    iput-object v1, v0, LVc/a;->b:Linet/ipaddr/g;

    move-object v1, p3

    iput-object v1, v0, LVc/a;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, LVc/a;->d:Ljava/lang/String;

    move-object v1, p5

    iput-object v1, v0, LVc/a;->e:Ljava/lang/String;

    move-object v1, p6

    iput-object v1, v0, LVc/a;->f:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, LVc/a;->g:Lcom/ui/wifiman/model/vendor/d;

    move-object v1, p8

    iput-object v1, v0, LVc/a;->h:Ljava/lang/String;

    move-object v1, p9

    iput-object v1, v0, LVc/a;->i:Ljava/lang/String;

    move-object/from16 v1, p10

    iput-object v1, v0, LVc/a;->j:Ljava/lang/String;

    move-object/from16 v1, p11

    iput-object v1, v0, LVc/a;->k:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, LVc/a;->l:Ljava/lang/String;

    move-object/from16 v1, p13

    iput-object v1, v0, LVc/a;->m:Ljava/lang/String;

    iput-object v2, v0, LVc/a;->n:Ljava/util/List;

    iput-object v3, v0, LVc/a;->o:Ljava/util/List;

    move-wide/from16 v1, p16

    iput-wide v1, v0, LVc/a;->p:J

    iput-object v4, v0, LVc/a;->q:LVc/g;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVc/a;->l:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVc/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LVc/a;->g:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public d()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LVc/a;->b:Linet/ipaddr/g;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVc/a;->h:Ljava/lang/String;

    return-object v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVc/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LVc/a;->n:Ljava/util/List;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LVc/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public getType()LUc/b;
    .locals 1

    iget-object v0, p0, LVc/a;->a:LUc/b;

    return-object v0
.end method
