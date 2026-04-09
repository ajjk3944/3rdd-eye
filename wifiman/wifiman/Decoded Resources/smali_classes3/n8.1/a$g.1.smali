.class final Ln8/a$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/a;-><init>(Lorg/kodein/di/DI;Ln8/a$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ln8/a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$g;

    invoke-direct {v0}, Ln8/a$g;-><init>()V

    sput-object v0, Ln8/a$g;->a:Ln8/a$g;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;Ll9/a;)Ll9/a;
    .locals 3

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwc/b;

    invoke-interface {p1}, LCc/a;->p()Lwc/a;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v2, p1, LCc/a$b;

    if-eqz v2, :cond_0

    check-cast p1, LCc/a$b;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v2}, Lq8/a;->a(Lwc/a;LCc/a$b;Lwc/b;Z)LBe/A0;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v1, LKe/a$f;

    invoke-direct {v1, p1, v2}, LKe/a$f;-><init>(LBe/A0;Z)V

    :cond_1
    new-instance p1, Ll9/a;

    invoke-direct {p1, v1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    check-cast p2, Ll9/a;

    invoke-virtual {p0, p1, p2}, Ln8/a$g;->a(LCc/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
