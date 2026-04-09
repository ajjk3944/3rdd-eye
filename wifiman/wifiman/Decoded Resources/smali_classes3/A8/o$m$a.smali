.class public final LA8/o$m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o$m;->a(Ljava/lang/Boolean;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;


# direct methods
.method public constructor <init>(LA8/o;)V
    .locals 0

    iput-object p1, p0, LA8/o$m$a;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LA8/o$m$a;->a:LA8/o;

    invoke-static {v0}, LA8/o;->T0(LA8/o;)Luc/a;

    move-result-object v0

    sget-object v1, Luc/a$a;->TICK:Luc/a$a;

    invoke-interface {v0, v1}, Luc/a;->a(Luc/a$a;)V

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
