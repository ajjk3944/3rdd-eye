.class final Ly8/e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly8/e;-><init>(Lre/a;Lje/u;LCc/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ly8/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly8/e$c;

    invoke-direct {v0}, Ly8/e$c;-><init>()V

    sput-object v0, Ly8/e$c;->a:Ly8/e$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/a$b;)LDj/a;
    .locals 1

    const-string/jumbo v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lre/a$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lre/a$b$a;

    invoke-virtual {p1}, Lre/a$b$a;->b()Lre/n;

    move-result-object p1

    invoke-interface {p1}, Lre/n;->c()Lgg/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lre/a$b$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lgg/i;->j0()Lgg/i;

    move-result-object p1

    const-string/jumbo v0, "empty(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lre/a$b;

    invoke-virtual {p0, p1}, Ly8/e$c;->a(Lre/a$b;)LDj/a;

    move-result-object p1

    return-object p1
.end method
