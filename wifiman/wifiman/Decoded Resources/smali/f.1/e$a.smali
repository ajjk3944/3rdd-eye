.class final Lf/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Lf/b;

.field private final b:Lg/a;


# direct methods
.method public constructor <init>(Lf/b;Lg/a;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contract"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf/e$a;->a:Lf/b;

    iput-object p2, p0, Lf/e$a;->b:Lg/a;

    return-void
.end method


# virtual methods
.method public final a()Lf/b;
    .locals 1

    iget-object v0, p0, Lf/e$a;->a:Lf/b;

    return-object v0
.end method

.method public final b()Lg/a;
    .locals 1

    iget-object v0, p0, Lf/e$a;->b:Lg/a;

    return-object v0
.end method
