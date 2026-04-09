.class final LQ/y$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/y;->a(LQ/A;Lmh/a;Lr/i;Lr/z;LT/l;II)LQ/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LQ/y$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ/y$a;

    invoke-direct {v0}, LQ/y$a;-><init>()V

    sput-object v0, LQ/y$a;->a:LQ/y$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LQ/y$a;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
