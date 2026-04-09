.class final LE8/l$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/l;-><init>(Lgg/i;Lorg/kodein/di/DI;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/l$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/l$g;

    invoke-direct {v0}, LE8/l$g;-><init>()V

    sput-object v0, LE8/l$g;->a:LE8/l$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Ll9/a;
    .locals 8

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LWc/b;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkd/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkd/e;->a()Ljava/net/URL;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v7, Ls9/c$b;

    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v1

    const-string/jumbo p1, "toURI(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LN9/b;->a:LN9/b;

    invoke-virtual {p1}, LN9/b;->B()Ls9/b;

    move-result-object v2

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ls9/c$b;-><init>(Ljava/net/URI;Ls9/a$b;Ls9/a$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v7}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, LE8/l$g;->a(LWc/b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
