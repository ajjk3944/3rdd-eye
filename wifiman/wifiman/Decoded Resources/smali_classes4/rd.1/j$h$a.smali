.class final Lrd/j$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrd/j$h;->a(LJa/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd/j$h$a$a;
    }
.end annotation


# static fields
.field public static final a:Lrd/j$h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrd/j$h$a;

    invoke-direct {v0}, Lrd/j$h$a;-><init>()V

    sput-object v0, Lrd/j$h$a;->a:Lrd/j$h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJa/a$d;)Lrd/a$a$b;
    .locals 3

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LJa/a$d;->c()LJa/a$c;

    move-result-object v0

    sget-object v1, Lrd/j$h$a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    new-instance v0, Lrd/a$a$b$c;

    invoke-virtual {p1}, LJa/a$d;->b()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_0
    invoke-virtual {p1}, LJa/a$d;->a()I

    move-result p1

    invoke-direct {v0, v2, p1}, Lrd/a$a$b$c;-><init>(II)V

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Lrd/a$a$b$a;

    invoke-virtual {p1}, LJa/a$d;->b()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_3
    invoke-direct {v0, v2}, Lrd/a$a$b$a;-><init>(I)V

    goto :goto_0

    :cond_4
    sget-object v0, Lrd/a$a$b$d;->a:Lrd/a$a$b$d;

    goto :goto_0

    :cond_5
    sget-object v0, Lrd/a$a$b$b;->a:Lrd/a$a$b$b;

    :goto_0
    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJa/a$d;

    invoke-virtual {p0, p1}, Lrd/j$h$a;->a(LJa/a$d;)Lrd/a$a$b;

    move-result-object p1

    return-object p1
.end method
