.class final Ln8/a$k;
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
.field public static final a:Ln8/a$k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln8/a$k;

    invoke-direct {v0}, Ln8/a$k;-><init>()V

    sput-object v0, Ln8/a$k;->a:Ln8/a$k;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LCc/a;)Ll9/a;
    .locals 6

    const-string/jumbo v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LCc/a;->f()Lxa/a$d;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1}, LLd/d;->a(Lxa/a$d;)Le8/a;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v1, LKe/a$c;

    invoke-virtual {p1}, Le8/a;->getPackageName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ls9/c$a;

    invoke-static {p1}, LNe/g;->a(Le8/a;)I

    move-result v4

    const/4 v5, 0x2

    invoke-direct {v3, v4, v0, v5, v0}, Ls9/c$a;-><init>(ILs9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ls9/d$a;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ln8/a$k$a;

    invoke-direct {v5, p1}, Ln8/a$k$a;-><init>(Le8/a;)V

    invoke-direct {v0, v4, v5}, Ls9/d$a;-><init>(Ljava/lang/String;Lmh/q;)V

    invoke-direct {v1, v2, v3, v0}, LKe/a$c;-><init>(Ljava/lang/String;Ls9/a;Ls9/d;)V

    move-object v0, v1

    :cond_0
    new-instance p1, Ll9/a;

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LCc/a;

    invoke-virtual {p0, p1}, Ln8/a$k;->a(LCc/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
