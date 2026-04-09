.class public final synthetic Lpb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/u;


# instance fields
.field public final synthetic a:Lpb/l;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lpb/l;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/h;->a:Lpb/l;

    iput-object p2, p0, Lpb/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lpb/h;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lpb/h;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Lgg/t;)V
    .locals 4

    iget-object v0, p0, Lpb/h;->a:Lpb/l;

    iget-object v1, p0, Lpb/h;->b:Ljava/lang/String;

    iget-object v2, p0, Lpb/h;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lpb/h;->d:Z

    invoke-static {v0, v1, v2, v3, p1}, Lpb/l;->f(Lpb/l;Ljava/lang/String;Ljava/lang/String;ZLgg/t;)V

    return-void
.end method
