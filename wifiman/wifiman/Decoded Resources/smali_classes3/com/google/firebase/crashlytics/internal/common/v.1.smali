.class public final synthetic Lcom/google/firebase/crashlytics/internal/common/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/crashlytics/internal/common/A;

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/crashlytics/internal/common/A;JLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/v;->a:Lcom/google/firebase/crashlytics/internal/common/A;

    iput-wide p2, p0, Lcom/google/firebase/crashlytics/internal/common/v;->b:J

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/v;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/v;->a:Lcom/google/firebase/crashlytics/internal/common/A;

    iget-wide v1, p0, Lcom/google/firebase/crashlytics/internal/common/v;->b:J

    iget-object v3, p0, Lcom/google/firebase/crashlytics/internal/common/v;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/crashlytics/internal/common/A;->a(Lcom/google/firebase/crashlytics/internal/common/A;JLjava/lang/String;)V

    return-void
.end method
