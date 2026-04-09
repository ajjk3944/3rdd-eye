.class final LV8/k$p;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV8/k;-><init>(LG6/G;Lh9/a;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;Ljava/util/UUID;LV8/e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LV8/k$p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LV8/k$p;

    invoke-direct {v0}, LV8/k$p;-><init>()V

    sput-object v0, LV8/k$p;->a:LV8/k$p;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "Connection STATE Finished"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LV8/k$p;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
