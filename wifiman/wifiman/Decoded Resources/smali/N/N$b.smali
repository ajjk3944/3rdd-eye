.class final LN/N$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/N$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/N$b;

    invoke-direct {v0}, LN/N$b;-><init>()V

    sput-object v0, LN/N$b;->a:LN/N$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN/M;
    .locals 1

    sget-object v0, LN/x;->a:LN/x;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/N$b;->a()LN/M;

    move-result-object v0

    return-object v0
.end method
