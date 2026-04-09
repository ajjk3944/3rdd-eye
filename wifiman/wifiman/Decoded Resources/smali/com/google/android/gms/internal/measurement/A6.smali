.class public final Lcom/google/android/gms/internal/measurement/A6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/k;


# static fields
.field private static b:Lcom/google/android/gms/internal/measurement/A6;


# instance fields
.field private final a:Lm4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/A6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/A6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/A6;->b:Lcom/google/android/gms/internal/measurement/A6;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/C6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/C6;-><init>()V

    invoke-static {v0}, Lm4/l;->b(Ljava/lang/Object;)Lm4/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/A6;->a:Lm4/k;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/A6;->b:Lcom/google/android/gms/internal/measurement/A6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/A6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/z6;->zza()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/A6;->b:Lcom/google/android/gms/internal/measurement/A6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/A6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/z6;->zzb()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/A6;->b:Lcom/google/android/gms/internal/measurement/A6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/A6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/z6;->zzc()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/A6;->b:Lcom/google/android/gms/internal/measurement/A6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/A6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/z6;->zzd()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/A6;->a:Lm4/k;

    invoke-interface {v0}, Lm4/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z6;

    return-object v0
.end method
