.class final LW9/e$n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW9/e;->B0(LW9/e;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LW9/e$n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LW9/e$n;

    invoke-direct {v0}, LW9/e$n;-><init>()V

    sput-object v0, LW9/e$n;->a:LW9/e$n;

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

    const-string/jumbo v0, "Failed to send initial code request"

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LW9/e$n;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
