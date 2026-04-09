.class public final LN/n0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LN/n0$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr/i;Lmh/l;ZLY0/d;)Lc0/k;
    .locals 2

    sget-object v0, LN/n0$a$a;->a:LN/n0$a$a;

    new-instance v1, LN/n0$a$b;

    invoke-direct {v1, p4, p2, p1, p3}, LN/n0$a$b;-><init>(LY0/d;Lmh/l;Lr/i;Z)V

    invoke-static {v0, v1}, Lc0/l;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object p1

    return-object p1
.end method
