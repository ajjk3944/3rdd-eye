.class final LM/C$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LM/C$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LM/C$a;

    invoke-direct {v0}, LM/C$a;-><init>()V

    sput-object v0, LM/C$a;->a:LM/C$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LM/B;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LM/C$a;->a()LM/B;

    const/4 v0, 0x0

    return-object v0
.end method
