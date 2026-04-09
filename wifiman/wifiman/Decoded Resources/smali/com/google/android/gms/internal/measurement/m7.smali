.class public final Lcom/google/android/gms/internal/measurement/m7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/k;


# static fields
.field private static b:Lcom/google/android/gms/internal/measurement/m7;


# instance fields
.field private final a:Lm4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/m7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/m7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/o7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/o7;-><init>()V

    invoke-static {v0}, Lm4/l;->b(Ljava/lang/Object;)Lm4/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/m7;->a:Lm4/k;

    return-void
.end method

.method public static a()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zza()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zzb()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zzc()Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zzd()Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zze()Z

    move-result v0

    return v0
.end method

.method public static f()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zzf()Z

    move-result v0

    return v0
.end method

.method public static g()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zzg()Z

    move-result v0

    return v0
.end method

.method public static h()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/m7;->b:Lcom/google/android/gms/internal/measurement/m7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/m7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q7;->zzh()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/m7;->a:Lm4/k;

    invoke-interface {v0}, Lm4/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q7;

    return-object v0
.end method
