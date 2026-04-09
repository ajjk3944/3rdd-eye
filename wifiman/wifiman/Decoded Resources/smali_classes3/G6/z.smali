.class public LG6/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG6/z$a;
    }
.end annotation


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:LG6/S;


# direct methods
.method constructor <init>(ZZLG6/S;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LG6/z;->a:Z

    iput-boolean p2, p0, LG6/z;->b:Z

    iput-object p3, p0, LG6/z;->c:LG6/S;

    return-void
.end method
