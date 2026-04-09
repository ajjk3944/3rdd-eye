.class public abstract LS8/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS8/e$b$a;,
        LS8/e$b$b;
    }
.end annotation


# instance fields
.field private final a:LYg/m;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, LS8/e$b$c;

    invoke-direct {v0, p0}, LS8/e$b$c;-><init>(LS8/e$b;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object v0

    iput-object v0, p0, LS8/e$b;->a:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LS8/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public final b()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LS8/e$b;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
