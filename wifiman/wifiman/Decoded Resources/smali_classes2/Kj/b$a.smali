.class LKj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKj/b;->a(Landroid/content/Context;LKj/b$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LKj/b$c;

.field final synthetic b:Landroid/content/res/AssetFileDescriptor;

.field final synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(LKj/b$c;Landroid/content/res/AssetFileDescriptor;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, LKj/b$a;->a:LKj/b$c;

    iput-object p2, p0, LKj/b$a;->b:Landroid/content/res/AssetFileDescriptor;

    iput-object p3, p0, LKj/b$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 7

    iget-object v0, p0, LKj/b$a;->a:LKj/b$c;

    iget-object v1, p0, LKj/b$a;->b:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v1}, Landroid/content/res/AssetFileDescriptor;->getParcelFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result v1

    iget-object v2, p0, LKj/b$a;->b:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v2}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v2

    iget-object v4, p0, LKj/b$a;->b:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v4

    iget-object v6, p0, LKj/b$a;->c:Ljava/lang/Object;

    invoke-interface/range {v0 .. v6}, LKj/b$c;->a(IJJLjava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method
