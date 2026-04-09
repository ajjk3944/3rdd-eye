.class final LX9/k$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LX9/k;->G0()Lgg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LX9/k$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LX9/k$b;

    invoke-direct {v0}, LX9/k$b;-><init>()V

    sput-object v0, LX9/k$b;->a:LX9/k$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "Failed to submit code"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LX9/k$b;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
