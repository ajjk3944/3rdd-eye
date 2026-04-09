.class final Lcom/google/android/gms/measurement/internal/m3;
.super Lo/v;
.source "SourceFile"


# instance fields
.field private final synthetic j:Lcom/google/android/gms/measurement/internal/i3;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/i3;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/m3;->j:Lcom/google/android/gms/measurement/internal/i3;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lo/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ls3/p;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/m3;->j:Lcom/google/android/gms/measurement/internal/i3;

    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/a4;->a()Lcom/google/android/gms/measurement/internal/l;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/N;->o1:Lcom/google/android/gms/measurement/internal/q2;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/l;->p(Lcom/google/android/gms/measurement/internal/q2;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/m3;->j:Lcom/google/android/gms/measurement/internal/i3;

    invoke-static {v0, p1}, Lcom/google/android/gms/measurement/internal/i3;->F(Lcom/google/android/gms/measurement/internal/i3;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/C;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/m3;->j:Lcom/google/android/gms/measurement/internal/i3;

    invoke-static {v0, p1}, Lcom/google/android/gms/measurement/internal/i3;->w(Lcom/google/android/gms/measurement/internal/i3;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/C;

    move-result-object p1

    return-object p1
.end method
