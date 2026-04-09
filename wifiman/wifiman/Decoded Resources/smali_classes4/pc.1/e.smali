.class public final synthetic Lpc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lgg/A;


# direct methods
.method public synthetic constructor <init>(Lgg/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/e;->a:Lgg/A;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lpc/e;->a:Lgg/A;

    invoke-static {v0, p1}, Lpc/j;->c(Lgg/A;Ljava/lang/Exception;)V

    return-void
.end method
