.class final LN/N$a;
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
.field public static final a:LN/N$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/N$a;

    invoke-direct {v0}, LN/N$a;-><init>()V

    sput-object v0, LN/N$a;->a:LN/N$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/N$a;->a()F

    move-result v0

    invoke-static {v0}, LY0/h;->d(F)LY0/h;

    move-result-object v0

    return-object v0
.end method
