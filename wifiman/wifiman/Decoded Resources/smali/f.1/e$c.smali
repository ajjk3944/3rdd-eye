.class final Lf/e$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf/e;->g()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lf/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/e$c;

    invoke-direct {v0}, Lf/e$c;-><init>()V

    sput-object v0, Lf/e$c;->a:Lf/e$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 2

    sget-object v0, Lqh/c;->a:Lqh/c$a;

    const/high16 v1, 0x7fff0000

    invoke-virtual {v0, v1}, Lqh/c$a;->g(I)I

    move-result v0

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lf/e$c;->a()Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
