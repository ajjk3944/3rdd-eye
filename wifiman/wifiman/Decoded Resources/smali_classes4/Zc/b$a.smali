.class final LZc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZc/b;-><init>(Lkd/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LZc/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZc/b$a;

    invoke-direct {v0}, LZc/b$a;-><init>()V

    sput-object v0, LZc/b$a;->a:LZc/b$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Lb8/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWc/b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lb8/a$b;->a:Lb8/a$b;

    goto :goto_1

    :cond_0
    instance-of v0, p1, LWc/b$a$b;

    if-eqz v0, :cond_1

    sget-object p1, Lb8/a$a;->a:Lb8/a$a;

    goto :goto_1

    :cond_1
    instance-of v0, p1, LWc/b$a$a;

    if-nez v0, :cond_3

    instance-of p1, p1, LWc/b$c;

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    sget-object p1, Lb8/a$c;->a:Lb8/a$c;

    :goto_1
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, LZc/b$a;->a(LWc/b;)Lb8/a;

    move-result-object p1

    return-object p1
.end method
