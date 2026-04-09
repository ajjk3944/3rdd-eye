.class public abstract LT/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LT/F1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lmh/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, LT/d0;

    invoke-direct {v0, p1}, LT/d0;-><init>(Lmh/a;)V

    iput-object v0, p0, LT/u;->a:LT/F1;

    return-void
.end method

.method public synthetic constructor <init>(Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LT/u;-><init>(Lmh/a;)V

    return-void
.end method


# virtual methods
.method public a()LT/F1;
    .locals 1

    iget-object v0, p0, LT/u;->a:LT/F1;

    return-object v0
.end method

.method public abstract b(LT/I0;LT/F1;)LT/F1;
.end method
