.class public final LTc/a$a;
.super LEc/t$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LTc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Linet/ipaddr/g;

.field private final b:Ljava/lang/String;

.field private final c:Lh9/a;

.field private final d:LW7/b;

.field private final e:LS8/g;

.field private final f:Ljava/lang/String;

.field private final g:Lxa/a$d;

.field private final h:Lcom/ui/wifiman/model/vendor/d;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:LS8/a;

.field private final l:LS8/l;

.field private final m:LCc/b;

.field private final n:J

.field private final o:J

.field private final p:LEc/t$c;


# direct methods
.method public constructor <init>(Linet/ipaddr/g;Ljava/lang/String;Lh9/a;LW7/b;LS8/g;Ljava/lang/String;Lxa/a$d;Lcom/ui/wifiman/model/vendor/d;Ljava/lang/String;Ljava/lang/String;LS8/a;LS8/l;LCc/b;JJ)V
    .locals 4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    const-string v3, "ipAddress"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "mac"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LEc/t$a;-><init>()V

    iput-object v1, v0, LTc/a$a;->a:Linet/ipaddr/g;

    move-object v1, p2

    iput-object v1, v0, LTc/a$a;->b:Ljava/lang/String;

    iput-object v2, v0, LTc/a$a;->c:Lh9/a;

    move-object v1, p4

    iput-object v1, v0, LTc/a$a;->d:LW7/b;

    move-object v1, p5

    iput-object v1, v0, LTc/a$a;->e:LS8/g;

    move-object v1, p6

    iput-object v1, v0, LTc/a$a;->f:Ljava/lang/String;

    move-object v1, p7

    iput-object v1, v0, LTc/a$a;->g:Lxa/a$d;

    move-object v1, p8

    iput-object v1, v0, LTc/a$a;->h:Lcom/ui/wifiman/model/vendor/d;

    move-object v1, p9

    iput-object v1, v0, LTc/a$a;->i:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, LTc/a$a;->j:Ljava/lang/String;

    move-object v1, p11

    iput-object v1, v0, LTc/a$a;->k:LS8/a;

    move-object/from16 v1, p12

    iput-object v1, v0, LTc/a$a;->l:LS8/l;

    move-object/from16 v1, p13

    iput-object v1, v0, LTc/a$a;->m:LCc/b;

    move-wide/from16 v1, p14

    iput-wide v1, v0, LTc/a$a;->n:J

    move-wide/from16 v1, p16

    iput-wide v1, v0, LTc/a$a;->o:J

    sget-object v1, LEc/t$c;->UNIFI:LEc/t$c;

    iput-object v1, v0, LTc/a$a;->p:LEc/t$c;

    return-void
.end method


# virtual methods
.method public a()LEc/t$c;
    .locals 1

    iget-object v0, p0, LTc/a$a;->p:LEc/t$c;

    return-object v0
.end method

.method public c()Linet/ipaddr/g;
    .locals 1

    iget-object v0, p0, LTc/a$a;->a:Linet/ipaddr/g;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, LTc/a$a;->o:J

    return-wide v0
.end method

.method public g()Lh9/a;
    .locals 1

    iget-object v0, p0, LTc/a$a;->c:Lh9/a;

    return-object v0
.end method

.method public final h()LCc/b;
    .locals 1

    iget-object v0, p0, LTc/a$a;->m:LCc/b;

    return-object v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTc/a$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTc/a$a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTc/a$a;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LTc/a$a;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final m()LS8/l;
    .locals 1

    iget-object v0, p0, LTc/a$a;->l:LS8/l;

    return-object v0
.end method

.method public final n()Lxa/a$d;
    .locals 1

    iget-object v0, p0, LTc/a$a;->g:Lxa/a$d;

    return-object v0
.end method

.method public final o()Lcom/ui/wifiman/model/vendor/d;
    .locals 1

    iget-object v0, p0, LTc/a$a;->h:Lcom/ui/wifiman/model/vendor/d;

    return-object v0
.end method

.method public final p()LS8/g;
    .locals 1

    iget-object v0, p0, LTc/a$a;->e:LS8/g;

    return-object v0
.end method
