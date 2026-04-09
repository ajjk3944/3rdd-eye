.class final Lje/v$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lje/v;-><init>(Lje/B;Lle/g;Lbe/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lje/v$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lje/v$f;

    invoke-direct {v0}, Lje/v$f;-><init>()V

    sput-object v0, Lje/v$f;->a:Lje/v$f;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;)Ll9/a;
    .locals 7

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lce/b;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lce/b;->e()LS8/c;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance v0, Ll9/a;

    invoke-virtual {p1}, Lce/b;->b()LS8/a;

    move-result-object v3

    invoke-virtual {p1}, Lce/b;->e()LS8/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lce/b;->a()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1}, Lce/b;->f()LS8/d;

    move-result-object v6

    invoke-virtual {p1}, Lce/b;->c()LW7/b;

    move-result-object v5

    new-instance p1, Lje/v$b;

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lje/v$b;-><init>(LS8/c;LS8/a;Ljava/lang/Integer;LW7/b;LS8/d;)V

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lje/v$f;->a(Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
