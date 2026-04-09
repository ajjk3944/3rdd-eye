.class final LP/s$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LP/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LP/s$a;

    invoke-direct {v0}, LP/s$a;-><init>()V

    sput-object v0, LP/s$a;->a:LP/s$a;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LP/r;
    .locals 1

    sget-object v0, LP/d;->b:LP/d;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP/s$a;->a()LP/r;

    move-result-object v0

    return-object v0
.end method
