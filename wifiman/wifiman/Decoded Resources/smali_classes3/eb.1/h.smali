.class public final synthetic Leb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/q;


# instance fields
.field public final synthetic a:Leb/g$c;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Leb/g$c;Ljava/lang/String;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leb/h;->a:Leb/g$c;

    iput-object p2, p0, Leb/h;->b:Ljava/lang/String;

    iput-boolean p3, p0, Leb/h;->c:Z

    iput-wide p4, p0, Leb/h;->d:J

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Leb/h;->a:Leb/g$c;

    iget-object v1, p0, Leb/h;->b:Ljava/lang/String;

    iget-boolean v2, p0, Leb/h;->c:Z

    iget-wide v3, p0, Leb/h;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Leb/g$c$b;->a(Leb/g$c;Ljava/lang/String;ZJ)Lgg/D;

    move-result-object v0

    return-object v0
.end method
