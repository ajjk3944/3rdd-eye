.class final LY6/t$m;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY6/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "m"
.end annotation


# instance fields
.field private final a:LY6/r;

.field private final b:LY6/h;

.field private final c:LY6/h;

.field private final d:LY6/h;

.field private final e:LY6/h;

.field private final f:LY6/h;


# direct methods
.method constructor <init>(LY6/r;)V
    .locals 1

    invoke-direct {p0}, LY6/h;-><init>()V

    iput-object p1, p0, LY6/t$m;->a:LY6/r;

    const-class v0, Ljava/util/List;

    invoke-virtual {p1, v0}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object v0

    iput-object v0, p0, LY6/t$m;->b:LY6/h;

    const-class v0, Ljava/util/Map;

    invoke-virtual {p1, v0}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object v0

    iput-object v0, p0, LY6/t$m;->c:LY6/h;

    const-class v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object v0

    iput-object v0, p0, LY6/t$m;->d:LY6/h;

    const-class v0, Ljava/lang/Double;

    invoke-virtual {p1, v0}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object v0

    iput-object v0, p0, LY6/t$m;->e:LY6/h;

    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, LY6/r;->c(Ljava/lang/Class;)LY6/h;

    move-result-object p1

    iput-object p1, p0, LY6/t$m;->f:LY6/h;

    return-void
.end method

.method private l(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2

    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const-class v0, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    return-object p1
.end method


# virtual methods
.method public b(LY6/k;)Ljava/lang/Object;
    .locals 3

    sget-object v0, LY6/t$b;->a:[I

    invoke-virtual {p1}, LY6/k;->d0()LY6/k$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Expected a value but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LY6/k;->d0()LY6/k$c;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " at path "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LY6/k;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {p1}, LY6/k;->T()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, LY6/t$m;->f:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, LY6/t$m;->e:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, LY6/t$m;->d:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, LY6/t$m;->c:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, LY6/t$m;->b:LY6/h;

    invoke-virtual {v0, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(LY6/o;Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, LY6/o;->h()LY6/o;

    invoke-virtual {p1}, LY6/o;->v()LY6/o;

    goto :goto_0

    :cond_0
    iget-object v1, p0, LY6/t$m;->a:LY6/r;

    invoke-direct {p0, v0}, LY6/t$m;->l(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    sget-object v2, La7/c;->a:Ljava/util/Set;

    invoke-virtual {v1, v0, v2}, LY6/r;->e(Ljava/lang/reflect/Type;Ljava/util/Set;)LY6/h;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "JsonAdapter(Object)"

    return-object v0
.end method
