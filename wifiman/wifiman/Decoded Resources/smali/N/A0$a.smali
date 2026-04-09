.class final LN/A0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN/A0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LN/A0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LN/A0$a;

    invoke-direct {v0}, LN/A0$a;-><init>()V

    sput-object v0, LN/A0$a;->a:LN/A0$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LN/y0;
    .locals 7

    new-instance v6, LN/y0;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, LN/y0;-><init>(JLP/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/A0$a;->a()LN/y0;

    move-result-object v0

    return-object v0
.end method
