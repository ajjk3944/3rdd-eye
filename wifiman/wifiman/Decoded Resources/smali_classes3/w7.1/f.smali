.class final Lw7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/b;


# instance fields
.field private final a:Lw7/e;


# direct methods
.method public constructor <init>(Lw7/e;)V
    .locals 1

    const-string/jumbo v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw7/f;->a:Lw7/e;

    return-void
.end method


# virtual methods
.method public b()Lu7/a;
    .locals 1

    iget-object v0, p0, Lw7/f;->a:Lw7/e;

    invoke-virtual {v0}, Lw7/e;->a()Lu7/a;

    move-result-object v0

    return-object v0
.end method
