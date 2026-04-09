.class public final Lcom/wireguard/android/backend/BackendException;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/wireguard/android/backend/BackendException$a;
    }
.end annotation


# instance fields
.field private final a:[Ljava/lang/Object;

.field private final b:Lcom/wireguard/android/backend/BackendException$a;


# direct methods
.method public varargs constructor <init>(Lcom/wireguard/android/backend/BackendException$a;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    iput-object p1, p0, Lcom/wireguard/android/backend/BackendException;->b:Lcom/wireguard/android/backend/BackendException$a;

    iput-object p2, p0, Lcom/wireguard/android/backend/BackendException;->a:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lcom/wireguard/android/backend/BackendException$a;
    .locals 1

    iget-object v0, p0, Lcom/wireguard/android/backend/BackendException;->b:Lcom/wireguard/android/backend/BackendException$a;

    return-object v0
.end method
