.class public final synthetic Li8/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lgg/o;


# direct methods
.method public synthetic constructor <init>(Lgg/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li8/v;->a:Lgg/o;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Li8/v;->a:Lgg/o;

    invoke-static {v0, p1}, Li8/y;->f(Lgg/o;Ljava/lang/Exception;)V

    return-void
.end method
