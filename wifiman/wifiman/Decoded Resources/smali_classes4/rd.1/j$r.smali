.class final Lrd/j$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j;->s(Lgg/i;Linet/ipaddr/g;)Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lrd/j$r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/j$r;

    invoke-direct {v0}, Lrd/j$r;-><init>()V

    sput-object v0, Lrd/j$r;->a:Lrd/j$r;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lrd/a$a$b;)Ll9/a;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lrd/a$a$b$b;

    if-nez v0, :cond_3

    instance-of v0, p1, Lrd/a$a$b$d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lrd/a$a$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Ll9/a;

    check-cast p1, Lrd/a$a$b$a;

    invoke-virtual {p1}, Lrd/a$a$b$a;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    instance-of v0, p1, Lrd/a$a$b$c;

    if-eqz v0, :cond_2

    new-instance v0, Ll9/a;

    check-cast p1, Lrd/a$a$b$c;

    invoke-virtual {p1}, Lrd/a$a$b$c;->b()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance v0, Ll9/a;

    const/4 p1, 0x0

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lrd/a$a$b;

    invoke-virtual {p0, p1}, Lrd/j$r;->a(Lrd/a$a$b;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
