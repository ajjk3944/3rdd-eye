.class public final synthetic Lcom/google/firebase/crashlytics/internal/common/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/firebase/crashlytics/internal/common/f0;

.field public final synthetic b:LN4/F$e$d;

.field public final synthetic c:LM4/c;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/crashlytics/internal/common/f0;LN4/F$e$d;LM4/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->a:Lcom/google/firebase/crashlytics/internal/common/f0;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->b:LN4/F$e$d;

    iput-object p3, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->c:LM4/c;

    iput-boolean p4, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->a:Lcom/google/firebase/crashlytics/internal/common/f0;

    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->b:LN4/F$e$d;

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->c:LM4/c;

    iget-boolean v3, p0, Lcom/google/firebase/crashlytics/internal/common/c0;->d:Z

    invoke-static {v0, v1, v2, v3}, Lcom/google/firebase/crashlytics/internal/common/f0;->a(Lcom/google/firebase/crashlytics/internal/common/f0;LN4/F$e$d;LM4/c;Z)V

    return-void
.end method
