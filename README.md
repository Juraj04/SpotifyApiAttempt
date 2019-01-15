# SpotifyApiAttempt
GUI for main activity plus two fragments
<StackPanel Height="400">
            
            <Slider x:Name="mySlider" />
            <TextBox x:Name="myTextBox" Text="{Binding ElementName=mySlider,Path=Value,Mode=TwoWay,UpdateSourceTrigger=PropertyChanged}"/>

            <ListBox Height="350"
                     ScrollViewer.VerticalScrollBarVisibility="Visible"  
                     ScrollViewer.HorizontalScrollBarVisibility="Visible"
                     ItemsSource="{Binding Source={StaticResource FriUnizaRss}}">
                <ListBox.ItemTemplate>
                    <DataTemplate>
                        <Grid>
                            <Grid.RowDefinitions>
                                <RowDefinition></RowDefinition>
                                <RowDefinition></RowDefinition>
                            </Grid.RowDefinitions>
                            <Label Grid.Row="0" Content="{Binding XPath=title}" />
                            <Button Grid.Row="1" Content="{Binding XPath=link}" Command="{StaticResource CommandOpenUrl}" CommandParameter="{Binding XPath=link}"/>
                        </Grid>
                    </DataTemplate>
                </ListBox.ItemTemplate>

            </ListBox>
        </StackPanel>
