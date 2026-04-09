.class public final synthetic Lg8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnFailureListener;


# instance fields
.field public final synthetic a:Lg8/l;


# direct methods
.method public synthetic constructor <init>(Lg8/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/b;->a:Lg8/l;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lg8/b;->a:Lg8/l;

    invoke-static {v0, p1}, Lg8/l;->W0(Lg8/l;Ljava/lang/Exception;)V

    return-void
.end method
