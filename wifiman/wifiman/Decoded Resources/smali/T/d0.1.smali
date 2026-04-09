.class public final LT/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/F1;


# instance fields
.field private final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LT/d0;->a:LYg/m;

    return-void
.end method

.method private final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LT/d0;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(LT/A0;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, LT/d0;->b()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
