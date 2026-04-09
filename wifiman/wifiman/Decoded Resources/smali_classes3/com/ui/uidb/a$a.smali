.class final Lcom/ui/uidb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ui/uidb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:LYa/a;

.field private final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LYa/a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ui/uidb/a$a;->a:LYa/a;

    iput-object p2, p0, Lcom/ui/uidb/a$a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/a$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()LYa/a;
    .locals 1

    iget-object v0, p0, Lcom/ui/uidb/a$a;->a:LYa/a;

    return-object v0
.end method
