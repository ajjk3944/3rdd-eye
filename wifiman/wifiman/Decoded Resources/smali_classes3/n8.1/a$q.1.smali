.class final Ln8/a$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$q;

    invoke-direct {v0}, Ln8/a$q;-><init>()V

    sput-object v0, Ln8/a$q;->a:Ln8/a$q;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LCc/a;->f()Lxa/a$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, LCc/m;->a(Lxa/a$d;)Z

    move-result v0

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LCc/a;->j()LDc/j;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LDc/j;->K()LRc/a$a;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, LDc/j;->J()LQc/a$b;

    move-result-object p1

    if-eqz p1, :cond_2

    :cond_1
    sget-object v1, LKe/a$g;->a:LKe/a$g;

    :cond_2
    :goto_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$q;->a(LCc/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
