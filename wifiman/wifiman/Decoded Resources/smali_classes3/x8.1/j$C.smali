.class final Lx8/j$C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx8/j;->f1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lx8/j$C;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx8/j$C;

    invoke-direct {v0}, Lx8/j$C;-><init>()V

    sput-object v0, Lx8/j$C;->a:Lx8/j$C;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lre/a$b;)Lgg/f;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lre/a$b$a;

    if-eqz v0, :cond_0

    check-cast p1, Lre/a$b$a;

    invoke-virtual {p1}, Lre/a$b$a;->a()Lre/c;

    move-result-object p1

    invoke-interface {p1}, Lre/c;->d()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lre/a$b$b;

    if-eqz p1, :cond_1

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

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

    invoke-virtual {p0, p1}, Lx8/j$C;->a(Lre/a$b;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
