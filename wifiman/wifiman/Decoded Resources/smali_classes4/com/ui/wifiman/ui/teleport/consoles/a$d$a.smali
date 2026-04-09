.class public final Lcom/ui/wifiman/ui/teleport/consoles/a$d$a;
.super Lcom/ui/wifiman/ui/teleport/consoles/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/teleport/consoles/a$d;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final g:LLi/z;

.field private final h:LLi/g;


# direct methods
.method constructor <init>()V
    .locals 30

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Lcom/ui/wifiman/ui/teleport/consoles/i;-><init>()V

    new-instance v1, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    new-instance v2, Ls9/d$b;

    sget v3, Lm8/c;->O3:I

    invoke-direct {v2, v3}, Ls9/d$b;-><init>(I)V

    const-string v3, "lastUsed"

    invoke-direct {v1, v3, v2}, Lcom/ui/wifiman/ui/teleport/consoles/h$c;-><init>(Ljava/lang/String;Ls9/d;)V

    new-instance v2, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    new-instance v6, Ls9/c$a;

    sget v3, Lm8/a;->y0:I

    const/4 v15, 0x0

    const/4 v14, 0x2

    invoke-direct {v6, v3, v15, v14, v15}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Ls9/d$c;

    const-string v4, "Console 1"

    invoke-direct {v7, v4}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v8, Ls9/d$c;

    const-string v13, "Online"

    invoke-direct {v8, v13}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v9, Lcom/ui/wifiman/ui/teleport/z;->ONLINE:Lcom/ui/wifiman/ui/teleport/z;

    sget-object v10, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTED:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/16 v16, 0x1

    const/16 v17, 0x1

    const-string v5, "0"

    const/4 v11, 0x1

    move-object v4, v2

    move-object/from16 v18, v13

    move/from16 v13, v16

    move v0, v14

    move/from16 v14, v17

    invoke-direct/range {v4 .. v14}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;ZLjava/lang/Boolean;ZZ)V

    new-instance v4, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    new-instance v5, Ls9/c$a;

    invoke-direct {v5, v3, v15, v0, v15}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Ls9/d$c;

    const-string v6, "Console 2"

    invoke-direct {v3, v6}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Ls9/d$c;

    move-object/from16 v7, v18

    invoke-direct {v6, v7}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v24, Lcom/ui/wifiman/ui/teleport/z;->UNSTABLE:Lcom/ui/wifiman/ui/teleport/z;

    sget-object v25, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTABLE:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/16 v28, 0x0

    const/16 v29, 0x0

    const-string v20, "1"

    const/16 v26, 0x1

    move-object/from16 v19, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v3

    move-object/from16 v23, v6

    move-object/from16 v27, v15

    invoke-direct/range {v19 .. v29}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;ZLjava/lang/Boolean;ZZ)V

    new-instance v3, Lcom/ui/wifiman/ui/teleport/consoles/h$c;

    new-instance v5, Ls9/d$b;

    sget v6, Lm8/c;->P3:I

    invoke-direct {v5, v6}, Ls9/d$b;-><init>(I)V

    const-string v6, "other"

    invoke-direct {v3, v6, v5}, Lcom/ui/wifiman/ui/teleport/consoles/h$c;-><init>(Ljava/lang/String;Ls9/d;)V

    new-instance v5, Lcom/ui/wifiman/ui/teleport/consoles/h$a;

    new-instance v12, Ls9/b$a;

    sget v7, Lm8/a;->Y:I

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Ls9/d$c;

    const-string v6, "Very Very Long Console Name, so long that it even doesn\'t fit into the preview"

    invoke-direct {v10, v6}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    new-instance v11, Ls9/d$c;

    const-string v6, "Offline"

    invoke-direct {v11, v6}, Ls9/d$c;-><init>(Ljava/lang/CharSequence;)V

    sget-object v6, Lcom/ui/wifiman/ui/teleport/z;->OFFLINE:Lcom/ui/wifiman/ui/teleport/z;

    sget-object v13, Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;->CONNECTION_NOT_POSSIBLE:Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;

    const/16 v16, 0x0

    const-string v8, "2"

    const/4 v14, 0x0

    move-object v7, v5

    move-object v9, v12

    move-object v12, v6

    invoke-direct/range {v7 .. v17}, Lcom/ui/wifiman/ui/teleport/consoles/h$a;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;Ls9/d;Lcom/ui/wifiman/ui/teleport/z;Lcom/ui/wifiman/ui/teleport/consoles/h$a$a;ZLjava/lang/Boolean;ZZ)V

    new-instance v6, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    const-string v7, "loading1"

    invoke-direct {v6, v7}, Lcom/ui/wifiman/ui/teleport/consoles/h$b;-><init>(Ljava/lang/String;)V

    new-instance v7, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    const-string v8, "loading2"

    invoke-direct {v7, v8}, Lcom/ui/wifiman/ui/teleport/consoles/h$b;-><init>(Ljava/lang/String;)V

    new-instance v8, Lcom/ui/wifiman/ui/teleport/consoles/h$b;

    const-string v9, "loading3"

    invoke-direct {v8, v9}, Lcom/ui/wifiman/ui/teleport/consoles/h$b;-><init>(Ljava/lang/String;)V

    const/16 v9, 0x9

    new-array v9, v9, [Lcom/ui/wifiman/ui/teleport/consoles/h;

    const/4 v10, 0x0

    aput-object v1, v9, v10

    const/4 v1, 0x1

    aput-object v2, v9, v1

    aput-object v4, v9, v0

    const/4 v0, 0x3

    aput-object v3, v9, v0

    const/4 v0, 0x4

    aput-object v5, v9, v0

    sget-object v0, Lcom/ui/wifiman/ui/teleport/consoles/h$d;->a:Lcom/ui/wifiman/ui/teleport/consoles/h$d;

    const/4 v1, 0x5

    aput-object v0, v9, v1

    const/4 v0, 0x6

    aput-object v6, v9, v0

    const/4 v0, 0x7

    aput-object v7, v9, v0

    const/16 v0, 0x8

    aput-object v8, v9, v0

    invoke-static {v9}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LLi/P;->a(Ljava/lang/Object;)LLi/z;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/ui/wifiman/ui/teleport/consoles/a$d$a;->g:LLi/z;

    invoke-static {}, LLi/i;->u()LLi/g;

    move-result-object v0

    iput-object v0, v1, Lcom/ui/wifiman/ui/teleport/consoles/a$d$a;->h:LLi/g;

    return-void
.end method


# virtual methods
.method public b()LLi/g;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/a$d$a;->h:LLi/g;

    return-object v0
.end method

.method public d()Lorg/kodein/di/DI;
    .locals 1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public bridge synthetic n0()LLi/N;
    .locals 1

    invoke-virtual {p0}, Lcom/ui/wifiman/ui/teleport/consoles/a$d$a;->r0()LLi/z;

    move-result-object v0

    return-object v0
.end method

.method public o0(Lcom/ui/wifiman/ui/teleport/consoles/h$a;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public p0(Lcom/ui/wifiman/ui/teleport/consoles/h;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public q0()V
    .locals 0

    return-void
.end method

.method public r0()LLi/z;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/ui/teleport/consoles/a$d$a;->g:LLi/z;

    return-object v0
.end method
