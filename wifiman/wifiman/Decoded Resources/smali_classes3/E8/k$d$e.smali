.class final LE8/k$d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE8/k$d;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LE8/k$d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LE8/k$d$e;

    invoke-direct {v0}, LE8/k$d$e;-><init>()V

    sput-object v0, LE8/k$d$e;->a:LE8/k$d$e;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lnf/b;Ll9/a;)Lnf/b;
    .locals 1

    const-string/jumbo v0, "previous"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhf/h;

    if-eqz p2, :cond_0

    new-instance p1, Lnf/b;

    const/4 v0, 0x1

    invoke-direct {p1, v0, p2}, Lnf/b;-><init>(ZLhf/h;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lnf/b;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lnf/b;->a()Lhf/h;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Lnf/b;-><init>(ZLhf/h;)V

    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnf/b;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, LE8/k$d$e;->a(Lnf/b;Ll9/a;)Lnf/b;

    move-result-object p1

    return-object p1
.end method
