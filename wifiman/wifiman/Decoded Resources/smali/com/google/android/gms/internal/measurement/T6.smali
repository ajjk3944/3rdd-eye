.class public final Lcom/google/android/gms/internal/measurement/T6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm4/k;


# static fields
.field private static b:Lcom/google/android/gms/internal/measurement/T6;


# instance fields
.field private final a:Lm4/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/T6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/T6;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/V6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/V6;-><init>()V

    invoke-static {v0}, Lm4/l;->b(Ljava/lang/Object;)Lm4/k;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/T6;->a:Lm4/k;

    return-void
.end method

.method public static a()D
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S6;->zza()D

    move-result-wide v0

    return-wide v0
.end method

.method public static b()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S6;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public static c()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S6;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public static d()J
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S6;->zzd()J

    move-result-wide v0

    return-wide v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S6;->zze()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f()Z
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/T6;->b:Lcom/google/android/gms/internal/measurement/T6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/T6;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/S6;->zzf()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/T6;->a:Lm4/k;

    invoke-interface {v0}, Lm4/k;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/S6;

    return-object v0
.end method
