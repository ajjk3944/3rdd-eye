.class final Ls0/f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/f;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Ls0/f$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls0/f$a;

    invoke-direct {v0}, Ls0/f$a;-><init>()V

    sput-object v0, Ls0/f$a;->a:Ls0/f$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lm0/X0;
    .locals 1

    invoke-static {}, Lm0/X;->a()Lm0/X0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ls0/f$a;->a()Lm0/X0;

    move-result-object v0

    return-object v0
.end method
